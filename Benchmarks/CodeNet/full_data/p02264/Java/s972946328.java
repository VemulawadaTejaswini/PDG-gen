import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public Main() {
    }

    public static void main(String[] args ) {
    		Main main = new Main();
    		main.exec();
    }

    public void exec() {
        BufferedReader bf = null;
        try{
            bf = new BufferedReader(new InputStreamReader(System.in));
            exec_body(bf);
        } catch (IOException e) {
			e.printStackTrace();
		}
        finally{
            if( bf != null ) {
                try {
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
            }
        }
    }

    public void exec_body( BufferedReader bf ) throws IOException {
    		// 標準入力から読み取り
        String line = bf.readLine();
        String[] lines = line.split(" ");
        int quantum = Integer.parseInt(lines[1]);

        IchiQueue<Process> pQueue = new IchiQueue<Process>(new Process[1000]);
        while( (line = bf.readLine()) != null ) {
        		lines = line.split(" ");
        		Process p = new Process(lines[0],Integer.parseInt(lines[1]));
        		pQueue.add(p);
        }

        int time = 0;
        ArrayList<Process> list = new ArrayList<>();
        while( !pQueue.isEmpty() ) {
        		Process element = pQueue.poll();
        		if( element._time > quantum ) {
        			element._time = element._time -quantum;
        			pQueue.add(element);
        			time = time + quantum;
        		} else {
        			time = time + element._time;
        			list.add(new Process(element._name,time));
        		}
        }

        list.forEach((Process element) -> {
        		System.out.println(element._name + " " + element._time );
        });
    }

    public class Process {
    		private String _name = null;
    		private int _time = 0;

    		public Process( String name, int time ) {
    			_name = name;
    			_time = time;
    		}

    		public String getName() {
    			return _name;
    		}

    		public int getTime() {
    			return _time;
    		}
    }

    public class IchiQueue<T> {
    		private int _start = 0;
    		private int _end = 1;
    		private T _ary[];

    		public IchiQueue(T[] ary ) {
    			_ary = ary;
    		}

    		public void add( T element ) {
    			if ( isFull() ) {
    				throw new RuntimeException("Collection is Full.");
    			}

    			_ary[_end] = element;
    			if( _end >= _ary.length -1 ) {
    				_end = 0;
    			}
    			else {
        			_end++;
    			}
    		}

    		public T poll() {
    			if( isEmpty() ) {
    				throw new RuntimeException("Collection is Empty.");
    			}

    			T val = _ary[_start];
    			if( _start >= _ary.length -1 ) {
    				_start = 0;
    			}
    			else {
    				_start++;
    			}
    			return val;
    		}

    		public boolean isEmpty() {
    			return _end - _start == 1;
    		}

    		public boolean isFull() {
    			return _start - _end == 1;
    		}
    }
}

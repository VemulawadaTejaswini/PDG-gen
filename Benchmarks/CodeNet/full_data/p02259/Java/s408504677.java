import java.io.*;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    int[] arr;

    int size;

    int swaps;

    public static void main(String[] args)
    {

        Main g = new Main();

        g.readArray();

        g.bubbleSort();

        g.printArray();

        System.out.println("\n" + g.swaps);
    }

    private void readArray() {

        InputReader reader = new InputReader(System.in);

        size = reader.nextInt();

        arr = new int[size];

        for(int i=0; i<size; ++i)
            arr[i] = reader.nextInt();
    }

    private void printArray() {

        PrintWriter writer = new PrintWriter(System.out);

        for(int i=0; i<size; ++i) {

            writer.write("" + arr[i]);

            if(i>size-1) writer.write(" ");
        }

        writer.flush();
    }


    private void bubbleSort() {

        boolean flag=false;

        for(int i=0; i<size-1; ++i) {

            flag=false;

            for(int j=i+1; j<size; ++j) {

                if(arr[i]>arr[j]) {

                    flag=true;

                    ++swaps;

                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

            // no swap has taken place so array is already sorted at this point
            if(!flag) break;
        }

    }


    class InputReader {

        private BufferedReader reader;

        private StringTokenizer tokenizer;

        InputReader(InputStream ip) {

            reader = new BufferedReader(new InputStreamReader(ip));
        }

        String next() {

            if(tokenizer==null || !tokenizer.hasMoreTokens()) {

                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return tokenizer.nextToken();
        }

        int nextInt() {

            return Integer.parseInt(next());
        }
    }
}


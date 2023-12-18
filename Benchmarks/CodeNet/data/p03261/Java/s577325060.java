import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        int a = scanner.nextInt();
        String[] siritori = new String[a];
        String end="";
        String head="";
        HashSet<String> hs = new HashSet<String>();
        int tmp;
        boolean chkFlg=true;
        for(int i=0;i<a;i++) {
        	siritori[i]=scanner.next();
        	tmp = hs.size();
    		hs.add(siritori[i]);
        	// 単語の1つ目は任意の単語なので、チェックを行わず、ループの2回目から判定を行う
        	if(i!=0) {
        		// headに今の単語の最初の1文字を入れる
        		head=siritori[i].substring(0,1);

        		// 今の単語の頭文字と前の単語の末尾の文字が不一致の場合、しりとりにならないので終了
        		if(!head.equals(end)){
        			System.out.println("No");
        			chkFlg=false;
        			break;
        		}
        		// 今の単語が今より前に出現していた場合、しりとりにならないので終了
        		/*
        		for(int j=0;j<i;j++) {
        			if(siritori[j].equals(siritori[i])) {
        				System.out.println("No");
        				chkFlg=false;
        				break;
        			}
        		}
        		*/
        		if(tmp==hs.size()) {
        			System.out.println("No");
    				chkFlg=false;
    				break;
        		}
        	}
        	// endに今の単語の最後の1文字を入れる
        	end=siritori[i].substring(siritori[i].length()-1, siritori[i].length());
        }
        // 最後までループが回る場合はしりとり成功
        if(chkFlg) {
        	System.out.println("Yes");
        }
    }

    private class MyScanner {
        String[] s;
        int i;
        BufferedReader br;
        String reg = " ";
        MyScanner () {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public String next() {
            try {
                if (i < s.length) return s[i++];
                String line = br.readLine();
                while (line.equals("")) {line = br.readLine();}
                s = line.split(reg, 0);
                i = 0;return s[i++];
            } catch (Exception e) {e.printStackTrace();}
            return null;
        }
        public int nextInt() {
            try {return Integer.parseInt(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
        public double nextDouble() {
            try {return Double.parseDouble(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
        public long nextLong()  {
            try {return Long.parseLong(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
    }
}
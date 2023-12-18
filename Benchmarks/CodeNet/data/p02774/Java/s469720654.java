import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//System.out.println();
public class Main implements Runnable { //クラス名はMain

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
    }
    public void run() {
        //ここに処理を書く
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        ArrayList<Long> ori = new ArrayList<Long>();
        ArrayList<Long> re = new ArrayList<Long>();

        for(int i=0; i<n; i++){
        	ori.add(Long.parseLong(sc.next()));
        }
        for(int l=0; l<ori.size(); l++){
        	for(int j=l+1; j<ori.size(); j++){
        		long r = ori.get(j)*ori.get(l);
		        re.add(r);
		    }
        }
        Collections.sort(re);
        System.out.println(re.get(k-1));
    }
}

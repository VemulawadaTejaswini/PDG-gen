import java.util.Scanner;

public class Main {
    public static void main(String args[] ) throws Exception {
    	new Main().exec(args);
    }

    public Main() {
    }

    private long[] ABC = new long[3];

    public void exec(String args[]) throws Exception {
    	//初期化読み込み
    	Scanner sc = new Scanner(System.in);
    	ABC[0] = sc.nextInt();
    	ABC[1] = sc.nextInt();
    	ABC[2] = sc.nextInt();
    	if(ABC[0] > ABC[1]) swap(0,1);
    	if(ABC[1] > ABC[2]) {
    		swap(1,2);
    		if(ABC[0] > ABC[1]) swap(0,1);
    	}
    	System.out.println(ABC[0]+","+ABC[1]+","+ABC[2]);
    	if(ABC[2]%2==0) {
    		System.out.println("0");
    	}else{
    		System.out.println(ABC[0]*ABC[1]);
    	}
	}

    private void swap(int index1, int index2) {
		long temp=ABC[index1];
		ABC[index1]=ABC[index2];
		ABC[index2]=temp;
    }
}
import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		long iix = sc.nextLong();
		long iiy = sc.nextLong();
        int retint = 0;
        for(long i=iix;i<=iiy;i*=2){
            retint++;
        }
		System.out.println(retint);
    }
}

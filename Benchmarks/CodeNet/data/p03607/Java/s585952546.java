import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[] a;
        a = new long[100001];
        long tmp;
        boolean flag = true;
        for(int i = 0; i < num; i++){
            a[i] = (long)0;
            tmp = (long)sc.nextInt();
            flag = true;
            for(int j = 0; j < i; j++){
                if(a[j] == tmp){
                    a[j] = (long)0;
                    flag = false;
                    break;
                }
            }
            if(flag)a[i] = tmp;
        }
        int count = 0;
        for(int i = 0; i < num; i++){
            if(a[i] != (long)0) count++;
        }
        System.out.print(count);
	}
}
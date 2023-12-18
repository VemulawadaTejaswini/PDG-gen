import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a;
        a = new int[100001];
        int tmp;
        boolean flag = true;
        int count = 0;
        for(int i = 0; i < num; i++){
            a[i] = 0;
            tmp = sc.nextInt();
            flag = true;
            for(int j = 0; j < i; j++){
                if(a[j] == tmp){
                    a[j] = 0;
                    flag = false;
                    count--;
                    break;
                }
            }
            if(flag){
                a[i] = tmp;
                count++;
            }
        }
        System.out.print(count);
	}
}
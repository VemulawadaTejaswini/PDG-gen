import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int a=sc.nextInt();
        int m[]=new int[a];
        for(int i=0;i<a;i++)
            m[i]=sc.nextInt();
        int count=1;
        for(int i=1;i<a;i++){
            int flag=0;
            for(int j=0;j<i;j++){
                if(m[j]<m[i]){
                    flag++;
                    break;
                }
            }
            if(flag==0)
                count++;
        }
        System.out.println(count);
    }
}
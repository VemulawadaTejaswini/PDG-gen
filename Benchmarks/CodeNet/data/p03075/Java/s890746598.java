import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int num[]=new int[5];
        for(int i=0;i<n;i++)num[i]=sc.nextInt();
        int k=sc.nextInt();
        boolean po=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(Math.abs(num[i]-num[j])>k)po=false;
            }
        }
        System.out.println((po)?"Yay!":":(");
    }
}

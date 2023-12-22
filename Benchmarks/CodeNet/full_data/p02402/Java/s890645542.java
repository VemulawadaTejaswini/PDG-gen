import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int min=sc.nextInt();
        int max=min;
        long sum=min;
        n--;
        while(n>0){
            int tmp=sc.nextInt();
            if(min>tmp)min=tmp;
            if(max<tmp)max=tmp;
            sum+=tmp;
            n--;
        }
        System.out.println(min+" "+max+" "+sum);
    }
}

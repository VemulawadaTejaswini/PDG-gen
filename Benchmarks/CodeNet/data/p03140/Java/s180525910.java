import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        int [] List = new int[N];
        for(int num=0;num<N;num++){
            int k =0;
            if(a.charAt(num)==b.charAt(num)) k++;
            if(a.charAt(num)==c.charAt(num))k++;
            if(b.charAt(num)==c.charAt(num))k++;
            if(k==0)List[num]=2;
            else if(k==1) List[num]=1;
        }
        int sum=0;
        for(int d=0;d<N;d++) sum+=List[d];
        System.out.println(sum);
    }
}

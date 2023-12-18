import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        HashMap map=new HashMap();
        int a=sc.nextInt();
        int m[]=new int[a];
        for(int i=0;i<a;i++) {
            m[i] = sc.nextInt();
            map.put(m[i],i);
        }
        Arrays.sort(m);
        int []c=new int[a];
        for(int i=0;i<a;i++) {
            //System.out.println((int)map.get(m[i]));
            int flag=0;
            for(int j=0;j<(int)map.get(m[i]);j++){
                if(c[j]!=0){
                    flag++;
                    break;
                }
            }
            if(flag==0)
                c[(int)map.get(m[i])]=1;
            if((int)map.get(m[i])==0)
                break;
        }
        int count=0;
        for(int i=0;i<a;i++){
            if(c[i]!=0)
                count++;
        }
        System.out.println(count);
    }
}

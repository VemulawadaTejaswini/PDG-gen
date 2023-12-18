import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[]a=new int[3];
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
    Arrays.sort(a);
    for(;;){
        if(a[1]-a[0]<2){
            a[0]++;
            a[1]++;
        }else{
            a[0]+=2;
        }
        Arrays.sort(a);
        sum++;
        if((a[0]==a[1])&&(a[1]==a[2])){
            System.out.println(sum);
            break;
        }
    }
}
        
        
    }

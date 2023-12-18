import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        String[] arr = str.split("");

        int len=arr.length;
        int[] tar=new int[len];
        for(int i=0;i<len;i++){
            tar[i]=Integer.parseInt(arr[i]);
        }

        int counter=0;
        for(int i=0;(i+3)<len;i++){
            long m=tar[i]*100+tar[i+1]*10+tar[i+2];
            for(int j=i+3;j<len;j++){
                m=m*10+tar[j];
                if((m%2019)==0){
                    counter++;
                    i=j-1;
                    break;
                }
            }
        }
        System.out.println(counter);
    }
}
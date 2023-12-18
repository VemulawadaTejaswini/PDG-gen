import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        String[] ar=new String[n];
        for(int i=0;i<n;i++){
            String buf=scn.next();
            char[] c = buf.toCharArray();
            Arrays.sort(c);
            ar[i]=String.valueOf(c);
        } 
        scn.close();
        int answer = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i].equals(ar[j])){
                     answer++;
                }
            }
            
        }
        System.out.println(answer);
    }
}


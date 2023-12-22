import java.io.*;
import java.util.*;



public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
                    
                    str = br.readLine();
                    int N = Integer.parseInt(str);
                    str = br.readLine();
                    String[] strs = str.split("\\s");

                    int[] A = new int[N];//for boble
                    char[] I = new char[N];
                    for(int i=0;i<N;i++){
                        I[i] = strs[i].charAt(0);
                        A[i] = Character.getNumericValue(strs[i].charAt(1));
                    }

                    int[] As= Arrays.copyOf(A,A.length);//for selection
                    char[] Is = Arrays.copyOf(I,I.length);
                    
                    int[] OA= Arrays.copyOf(A,A.length);//for saving original array
                    char[] OI = Arrays.copyOf(I,I.length); 

                    String B = bobles(I,A);
                    String S = selects(Is,As);

                    System.out.println(B);
                    System.out.println("Stable");
                    System.out.println(S);
                    if(B.equals(S)){
                        System.out.println("Stable");
                    }else{
                        System.out.println("Not stable");
                    }
                    
                    br.close();
    }
    public static String bobles(char[] I,int[] A){
        for(int i = 0; i < A.length ;i++ ){
            for(int j =(A.length-1); j >= 1 ;j--){
                if(A[j] < A[j-1]){
                    int tmp = A[j];
                    char ti = I[j];

                    A[j] = A[j-1];
                    I[j] = I[j-1];

                    A[j-1] = tmp;
                    I[j-1] = ti;
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for(int i=0; i< A.length;i++){
            sb.append(I[i]);
            sb.append(A[i]);
            if(i != (A.length -1)){
                sb.append(" ");
            }
        }
        return sb.toString();
    }


    public static String selects(char[] I,int[] A){
        for(int i = 0;i < A.length;i++){
            int minj = i;
            for(int j= i;j < A.length;j++){
                if(A[j] < A[minj]){
                    minj = j;
                }
            }
            int tmp = A[i];
            char ti = I[i];

            A[i] = A[minj];
            I[i] = I[minj];

            A[minj] = tmp;
            I[minj] = ti;
        }

        StringBuffer sb = new StringBuffer();
        for(int i=0; i< A.length;i++){
            sb.append(I[i]);
            sb.append(A[i]);
            if(i != A.length -1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

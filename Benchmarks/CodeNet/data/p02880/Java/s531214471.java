import java.util.*;
import java.io.*;
public class Main {

    public static void main (String[] args) throws java.lang.Exception
{
    BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
    int N = Integer.parseInt(inp.readLine());
    ArrayList<Integer> list = new ArrayList<>();
    if(N <= 9 && N >=1){
        System.out.println("Yes");
    }else if(N <= 0){
        System.out.println("No");
    }else{
        for(int i = 1 ; i <= N/2 ; i++){
            if(N%i == 0){
                list.add(i);
            }
        }
        if(list.size()==3){
            Collections.sort(list);
            if(list.get(1)<=9 && list.get(1)>=1 && list.get(2)<=9 && list.get(2) >= 1 ){
                System.out.println("Yes");
            }
        }else System.out.println("No");
    }
   

    
}
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();            
        for(int i=1;i<=n;i++){
            if(i%3==0){
                list.add(i);
            }else{
                String s = String.valueOf(i);
                if(s.contains("3")){
                    list.add(i);
                }
            }
        }
        for(int i =0;i<list.size();i++){
            if(i==list.size()-1){
                System.out.println(" "  + list.get(i));
            }else{
                System.out.print(" "  + list.get(i));
            }
        }
    }
}



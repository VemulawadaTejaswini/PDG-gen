import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();
    }
 
    public void input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        ArrayList<Integer> li = primeSet();
        for(int j = 0; j < n; j++){
            System.out.print(li.get(j));
            if(j == n - 1){
                break;
            }
            System.out.print(" ");
        }
        System.out.println();
        
    }

    public ArrayList<Integer> primeSet(){
        ArrayList<Integer> pli = new ArrayList<Integer>();
        ArrayList<Integer> li = new ArrayList<Integer>();
        pli.add(2);
        
        for(int i = 3; i <= 10000; i = i + 2){
            boolean check = true;
            for(int j = 0; j < pli.size(); j++){
                if(i % pli.get(j) == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                pli.add(i);
                if(i % 8 == 1){
                    li.add(i);
                }
            }
        }

        return li;
    }
    
}
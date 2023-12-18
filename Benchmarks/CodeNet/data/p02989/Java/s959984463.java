import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        ArrayList<Integer> l = new ArrayList<>();
        for(int i =0; i < N ;i++){
            l.add(Integer.parseInt(sc.next()));
        }
        Collections.sort(l);
        if(l.get(l.size()/2) == l.get(l.size()/2-1)){
            System.out.println(0);
        }else{
            System.out.println(l.get(l.size()/2)-l.get(l.size()/2-1));
        }
    }
}
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //ArrayList<Integer> list;
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        String ans = "YES";
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        for(int i = 0; i < n - 1 ; i++){
            if(list.get(i)==list.get(i+1)){
                ans = "NO";
            }
        }
        System.out.println(ans);

    
	}
}
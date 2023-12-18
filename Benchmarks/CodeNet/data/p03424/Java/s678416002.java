import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Set<String> set = new HashSet<>();
        String[] a = sc.nextLine().split(" ",0);
        for(int i = 0;i<n;i++){
            set.add(a[i]);
        }
        int answer = 0;
        if(set.contains("Y") == true){
            answer++;
        }
        if(set.contains("G") == true){
            answer++;
        }
        if(set.contains("W") == true){
            answer++;
        }
        if(set.contains("P") == true){
            answer++;
        }
        if(answer >= 4){
            System.out.println("Four");
        }else{
            System.out.println("Three");
        }
    }
}
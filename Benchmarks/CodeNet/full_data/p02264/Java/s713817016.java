import java.util.*;
import java.lang.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int work = Integer.parseInt(line[1]);
        int sumTime = 0;
        ArrayDeque<Struct> arr = new ArrayDeque<Struct>();
        for(int i = 0; i < n; i++){
            String[] line2 = sc.nextLine().split(" ");
            String name = line2[0];
            int time = Integer.parseInt(line2[1]);
            Struct s = new Struct(name,time);
            arr.push(s);
        }
        while(!(arr.isEmpty())){
            Struct sb = arr.removeLast();
            if(sb.time > work){
                sb.time-= work;
                arr.push(sb);
                sumTime+= work;
            }else{
                sumTime+=sb.time;
                System.out.print(sb.name + " ");
                System.out.println(sumTime);

            }

        }




    }
}
class Struct{
    String name;
    int time;
    public Struct(String n, int t){
        name = n;
        time = t;
    }
}
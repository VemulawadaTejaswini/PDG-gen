import java.util.*;
 
class process {
    public String name;
    public int time;
     
    public process(String name,int time){
        this.name = name;
        this.time = time;
    }
}

public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int q = sc.nextInt();
 
        ArrayList<process> ar = new ArrayList<process>();
        ArrayList<process> result = new ArrayList<process>();
         
        for (int i = 0; i < n; ++i){
            ar.add(new process(sc.next(),Integer.parseInt(sc.next())));
        }
         
        int LapsedTime = 0,i = 0;
        process p;
         
        while(true){
            if(i < n){
                if((p = ar.get(i)).time - q <= 0){
                    LapsedTime += p.time;
                    result.add(new process(p.name,LapsedTime));
                    ar.remove(i);
                    n--;
                } else {
                    LapsedTime += q;
                    p.time = p.time - q;
                    i++;
                }
            } else {
                i = 0;
            }
            if (n == 0){
                break;
            }
        }
        for(process r:result) {
            System.out.println(r.name + " " + String.valueOf(r.time));
        }
    }
}
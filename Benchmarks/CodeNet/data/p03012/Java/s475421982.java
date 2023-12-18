import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int t = Integer.parseInt(scan.next());

        Integer w[] = new Integer[t];
        for(int i=0;i<t;i++)
            w[i] = Integer.parseInt(scan.next());

        Integer d[] = new Integer[t];
        for(int i=0;i<t;i++){
            d[i] = 0;
            for(int j=0;j<t;j++){
                if(j<=i)
                    d[i] += w[j];
                else
                    d[i] -= w[j];
            }
            d[i] = Math.abs(d[i]);
        }
        
        System.out.println("\n" + getMin(d));
    }

    static Integer getMin(Integer d[]){
        int min = d[0];
        for(int i=0;i<d.length;i++){
            if(min>d[i])
                min = d[i];
        }
        return min;
    }
}
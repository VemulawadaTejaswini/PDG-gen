import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] ary = new int[n];

        for(int i = 0; i < n; i++)
            ary[i] = stdIn.nextInt();

        int max = ary[0];
        for(int i = 1; i < n; i++)
            if(max < ary[i])
                max = ary[i];
        
        int center = max / 2;

        int index = 0;
        int min = 0;
        int x = 0;
        if(center < ary[0])
            min = ary[0] - center;
        else
            min = center - ary[0];
        for(int i = 1; i < n; i++){
            if(center < ary[i])
                x = ary[i] - center;
            else
                x = center - ary[i];
            if(min > x){
                min = x;
                index = i;
            }
        }

        System.out.println(max + " " + ary[index]);
    }
}
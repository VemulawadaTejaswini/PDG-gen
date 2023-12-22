import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int dai[] = new int[n+1];
        boolean gDai[] = new boolean[n+1];
        int count = 0;

        for(int i = 1; i < n + 1; i++) {
            dai[i] = scan.nextInt();
            gDai[i] = true;
        }

        for(int i = 0; i < m; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(!gDai[a] && !gDai[b]) continue;

            if(dai[a] > dai[b]) gDai[b] = false;
            else if(dai[a] < dai[b]) gDai[a] = false;
            else{gDai[a] = false; gDai[b] = false;}
        }

        scan.close();

        for(int i = 1; i < n + 1; i++) {
            if(gDai[i]) count++;
        }

        System.out.println(count);


    }
}

import java.util.Scanner;

public class Main{

    int lines, i, j, arrayKeep;
    int[] sqnc;

    public void sort(){
        for(i = 1; i < lines; i++){
            int key = sqnc[i];
            j = i-1;
            while(j>=0 && sqnc[j] > key){
                sqnc[j+1] = sqnc[j];
                j--;
                sqnc[j+1] = key;
            }
            System.out.println(stringOut(sqnc));
        }
    }

    public String stringOut(int[] input){
        String out = "";
        for(arrayKeep = 0; arrayKeep <lines-1;arrayKeep++){
            out = out + input[arrayKeep]+" ";
        }
        out += input[lines-1];
        return out;
    }

    public void run(){

        Scanner sc = new Scanner(System.in);
        lines = sc.nextInt();
        sqnc = new int[lines];
        for(i=0;i<lines;i++){
            sqnc[i] = sc.nextInt();
        }
        System.out.println(stringOut(sqnc));
        sort();
    }

    public static void main(String[] args){
        new Main().run();
    }
}

import java.io.*;
import java.util.*;
 
public class Main {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
 
        Integer num = Integer.parseInt(s.nextLine());
        String input = s.nextLine();
        s.close();
 
        Integer[] seq = new Integer[num];
        if(input.contains("  ")){
            input = input.replace("  ", " ");
            input = input.substring(0, input.length() - 1);
        }
        String[] input_list = input.split(" ");
        for(int i = 0; i < num; i++){
            seq[i] = Integer.parseInt(input_list[i]);
        }
 
        for(int j = 1;j < seq.length; j++){
            print_seq(seq);
            Integer key = seq[j];
            Integer i = j - 1;
            while(i >= 0 && seq[i] > key){
                Integer bkp = seq[i+1];
                seq[i+1] = seq[i];
                seq[i] = bkp;
                i -= 1;
            }
        }
        print_seq(seq);
    }
 
    private static void print_seq(Integer[] seq){
    	String output = "";
        for(int i = 0; i < seq.length; i++){
            if(i == seq.length - 1){
                output = output + seq[i] + "\n";
            }
            else{
                output = output + seq[i] + " ";
            }
        }
        System.out.print(output);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
       //List<Integer>list = new ArrayList<Integer>();
        String[] fList = new String[Integer.parseInt(n)];
        Integer[] list = new Integer[Integer.parseInt(n)];
        fList = br.readLine().split(" ");
        for(int i = 1; i <= Integer.parseInt(n); i++){
           list[i - 1] = Integer.parseInt(fList[Integer.parseInt(n) - i]);
        }
        for(int i = 0; i < list.length; i++)
        System.out.print(list[i] + " ");
    }
 }
 
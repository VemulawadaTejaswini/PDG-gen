import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args)throws IOException{
	BufferedReader br = new	BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
	
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
	int L = scan.nextInt();
        for(int i=0;i<N;i++){
            list.add(br.readLine());
	}
	String allStr = "";
        Collections.sort(list);
        for(String str : list){
            allStr += str;
        }
        System.out.println(allStr.replaceAll("\n",""));
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int data[] = new int[26];
        String test = "abcdefghijklmnopqrstuvwxyz";
        String str,str2;
        int j,i;

        while(sc.hasNext()) {
            str = sc.nextLine();
            str2=str.toLowerCase();

            for(i=0;i<str2.length();i++){
            	for(j=0;j<26;j++) {
            		if(test.charAt(j)==str2.charAt(i)) {
            			data[j]++;
            		}
            	}
            }
            
        }
        for(i=0;i<26;i++){
        	System.out.println(test.charAt(i)+" : "+data[i]);
        }
        sc.close();
    }
}


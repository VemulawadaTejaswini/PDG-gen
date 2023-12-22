import java.util.Scanner;
public class s8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int data[] = new int[26];
        String test = "abcdefghijklmnopqrstuvwxyz";
        String str,str2;


        while(sc.hasNext()) {
            str = sc.nextLine();
            str2=str.toLowerCase();



            for(int i=0;i<str2.length();i++){
            	for(int j=0;j<26;j++) {
            		if(test.charAt(i)==str2.charAt(j))data[j]++;
            	}
            }

        }

        for(int i=0;i<26;i++) {
        	System.out.println(test.charAt(i)+" : "+data[i]);
        }

        sc.close();
    }
}


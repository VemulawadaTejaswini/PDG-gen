import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);
        int[] Question = new int[26];
        //Question[0]:the number of Qs which starts with 'A',[1]:'B'......
        for(int n=0;n<N;n++){
        	String Qname = br.readLine();
        	char firstLetter = Qname.charAt(0);
        	int firstLetterID = firstLetter - 'A';
        	Question[firstLetterID] ++;
        }
        int KUPCheld = 0;
        boolean KUPCend = false;
        while(!KUPCend){
        	Arrays.sort(Question);
        	for(int i=26-K;i<26;i++) {
        		if(Question[i]<=0) KUPCend = true;
        		else Question[i] --;
        	}
        	if(!KUPCend) KUPCheld++;
        }
        
        System.out.println(KUPCheld);
    }
}
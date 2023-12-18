import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
        int scanA =  scan.nextInt();
        int scanB =  scan.nextInt();
      	int scanBdec = scaB;
        int scanBinc = scaB;
      	AarrayList<Integer> list = new AarrayList().add(scanB);

        for(int i = 0; i < scanA ; i++;){
              list.add(0, scanBdec--);
              list.add(scanBinc++);
        }
      
      
      	System.out.println(list);
    }
}
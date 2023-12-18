import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
        int scanA =  scan.nextInt();
        int scanB =  scan.nextInt();
      	int scanBdec = scanB;
        int scanBinc = scanB;
      	ArrayList<Integer> list = new ArrayList<>;
      	list.add(scanB);
        for(int i = 0; i < scanA ; i++){
              list.add(0, scanBdec--);
              list.add(scanBinc++);
        }
      
		Set<Integer> set = new HashSet<>(list);
		ArrayList<Integer> list2 = new ArrayList<>(set);

      	for( int list3 : list2 ) {
          	if( list3 > -1000001 && list3 < 1000001 ) {
			System.out.print(list3 +" ");
            }
        }
    }
}
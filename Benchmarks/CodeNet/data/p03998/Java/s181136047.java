import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static String getWinner(String AsHand, String BsHand, String CsHand, String turn){
		if(turn.equals("A")){
			if(AsHand.isEmpty()) return "A";
			if(AsHand.startsWith("a")){
				return getWinner(AsHand.substring(1),BsHand,CsHand,"A");
			}
			if(AsHand.startsWith("b")){
				return getWinner(AsHand.substring(1),BsHand,CsHand,"B");
			}
			return getWinner(AsHand.substring(1),BsHand,CsHand,"C");
		}
		if(turn.equals("B")){
			if(BsHand.isEmpty()) return "B";
			if(BsHand.startsWith("a")){
				return getWinner(AsHand,BsHand.substring(1),CsHand,"A");
			}
			if(BsHand.startsWith("b")){
				return getWinner(AsHand,BsHand.substring(1),CsHand,"B");
			}
			return getWinner(AsHand,BsHand.substring(1),CsHand,"C");
		}
		// if C's turn
			if(CsHand.isEmpty()) return "C";
			if(CsHand.startsWith("a")){
				return getWinner(AsHand,BsHand,CsHand.substring(1),"A");
			}
			if(CsHand.startsWith("a")){
				return getWinner(AsHand,BsHand,CsHand.substring(1),"B");
			}
			return getWinner(AsHand,BsHand,CsHand.substring(1),"C");
		
		
	}
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String AsHand = br.readLine();
        String BsHand = br.readLine();
        String CsHand = br.readLine();
        System.out.println(getWinner(AsHand,BsHand,CsHand,"A"));
    }
}
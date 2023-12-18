    import java.util.Scanner;

    public class Main {
    	public static void main(String[] args){
    		 Scanner sc = new Scanner(System.in);
    		 String insert = sc.next();
    		 String ajitama = insert.substring(0,1);
    		 String tyashu = insert.substring(1,2);
    		 String negi = insert.substring(2,3);
    		 int ramen_nedan = 700;
    		 int tuika_nedan = 100;
    		 int kensaku = 0;
    		 String kensakuMoji = "o";
    		 String[] inserthairetsu = {ajitama,tyashu,negi};

    		 for(int i = 0; i < inserthairetsu.length; i++) {

    			 if(inserthairetsu[i].equals(kensakuMoji)) {
    				 kensaku++;
    			 }
    		 }
    		 System.out.println(ramen_nedan + (tuika_nedan * kensaku));
    	}
    }
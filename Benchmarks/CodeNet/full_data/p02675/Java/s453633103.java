import java.util.*
public class Main{
	public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
        String x = s.next();
        String xx = x.substring(x.length-2);
        String hon = "hon";
        if(xx == 3){
        	hon = "bon";
        }else if(xx==0||xx==1||xx==6||xx==8){
        	hon = "pon";
        }
        System.out.println(hon);
	}
}
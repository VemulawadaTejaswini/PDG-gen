import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fre = sc.nextInt(); // ?????°
		int num = 0;
		int count = 0;
		int co = 0;
		int tpoint = 0;
		int hpoint = 0;
		String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for(int k=0; k<fre; k++){
			String taro = sc.next();
			String hana = sc.next();
			String[] taArray = taro.split("");
			String[] haArray = hana.split("");
			count = taArray.length;
			if(taArray.length<haArray.length){
				co = 1;
			}else if (taArray.length>haArray.length){
				count = haArray.length;
				co = 2;
			}
			word: for(int i=0; i<count; i++){
				for(int j=0; j<abc.length; j++){
					if((taArray[i].equals(abc[j]) && (!haArray[i].equals(abc[j]))) || (co==1 && i==count-1)){
						hpoint += 3;
						break word;
					}else if((haArray[i].equals(abc[j]) && (!taArray[i].equals(abc[j]))) || (co==2 && i==count-1)){
						tpoint += 3;
						break word;
					}else if(co==0 && i==count-1){
						hpoint+=1;
						tpoint+=1;
						break word;
					}
				}
			}
		}
		System.out.println(tpoint + " " + hpoint);
	}
}
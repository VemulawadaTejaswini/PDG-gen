import java.util.Scanner;

class Main
{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
		
	char[] kari = new char[1000];
	String[] ord = new String[101];
	int x = 0;
	
	String Str = scan.nextLine();
		char[] str = Str.toCharArray();
	
	int q = scan.nextInt();
	
	while(scan.hasNext()){
		ord[x] = "";
		ord[x] = scan.nextLine();
		x++;
		if(x > q){
			break;}}
	
	for(int i=1; i<=q; i++){
		String[] tek = ord[i].split(" ");
		
		int a = Integer.parseInt(tek[1]);
		int b = Integer.parseInt(tek[2]);
		
		if(tek[0].equals("replace")){
			char[] p = tek[3].toCharArray();
			for(int j=0; j<=b-a; j++){
				str[a+j] = p[j];}}
		else if(tek[0].equals("reverse")){
			for(int j=a; j<=b; j++){
				kari[j] = str[j];}
			for(int j=0; j<=b-a; j++){
				str[a+j] = kari[b-j];}}
		else{
			for(int j=a; j<=b; j++){
				System.out.print(str[j]);}
			System.out.print("\n");}}
	}
}

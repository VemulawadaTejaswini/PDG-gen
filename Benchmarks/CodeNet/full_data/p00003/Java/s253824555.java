import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Tenmou{
    public static void main (String[] args) {

	int n;
	int a,b,c;
	int x[];
	x= new int[3];
	String strbf;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	try{
	      	strbf = br.readLine();
    	}catch(IOException e){
      		System.out.println("??\?????¨??????:" + e.getMessage());
    	}
	n = Integer.parseInt(strbf);
	String str[];
	str = new String[n];

	for(int i=0;i<n;i++){

	a = Integer.parseInt(br.readLine());
	b = Integer.parseInt(br.readLine());
	c = Integer.parseInt(br.readLine());

	x[0]=max(a,b,c);

	if(x[0]==a){
		x[1]=b;
		x[2]=c;
	}else if(x[0]==b){
		x[1]=a;
		x[2]=c;
	}else{
		x[1]=b;
		x[2]=a;
	}//if

	if(x[0]^2==x[1]^2+x[2]^2){
		str[i]="YES";
	}else{
		str[i]="NO";
	}//if
	}//for

	for(int i=0;i<n;i++){
				System.out.println(str[i]);
	}//for
}//method
}//class
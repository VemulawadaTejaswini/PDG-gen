import java.io.*;
class Main{
    public static boolean IsPrime(int n){
	int i;
	if(n<2)
	    return false;
	else if(n==2)
	    return true;

	if(n%2==0)
	    return false;
	for(i=3;i*i<=n;i+=2){
	    if(n%i==0)
		return false;
	}
	return true;
    }
    public static void main(String[] args)throws IOException{
	BufferedReader br=
	    new BufferedReader(new InputStreamReader(System.in));
	String buf;

	while(true){
	    int comb=0;
	    if((buf=br.readLine())==null)break;;
	    if(buf.length()==0)break;
	    int n=Integer.parseInt(buf);
	    for(int i=2;i<=n;i++){
		if(IsPrime(i))comb++;
	    }
	    System.out.println(comb);
	}
    }
}
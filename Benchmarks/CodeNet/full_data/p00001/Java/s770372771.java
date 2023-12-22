public class Sample01{
public static void main(String args[]) throws IOException{
	int [] a=new int[10];
	for(int i=0;i<10;i++){
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();
	a[i]=Integer.parseInt(str);
	
	
	}
	for(int i=0;i<10;i++){
		for(int j=0,k=1;k<10;j++,k++){
			if(a[j]<a[k]){
				int tmp =a[j];
				a[j]=a[k];
				a[k]=tmp;
			}
		}
	}
	for(int i=0;i<3;i++){
	System.out.println(a[i]);
	}
	
}}
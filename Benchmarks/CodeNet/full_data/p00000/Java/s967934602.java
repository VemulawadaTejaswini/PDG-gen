public class Program{
	public void output(){
		int ans=0;
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				ans=i*j;
				System.out.println(i+"x"+j+"="+ans);
			}
		}
	}
	public static void main(String[] args) {
		Program p = new Program();
		p.output();
	}
}
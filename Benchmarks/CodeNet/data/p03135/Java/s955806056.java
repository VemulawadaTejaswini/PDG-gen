public class Main {
	
	public static void main(String[] args){
		if(args.length<2){return;}
		try{
			int T = Integer.parseInt(args[0]);
			int X = Integer.parseInt(args[1]);
			double t = (double)T/X;
			System.out.print(String.format("%.7f", t));
		}catch(Exception e){
			e.printStackTrace();
		}
		return;
	}

}

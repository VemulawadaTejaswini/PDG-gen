import java.util.*;
class OK{
	private int c;
	private int h;
	public OK(int c,int h){
		this.c = c;
		this.h = h;
	}
	public int getC(){
		return c;
	}
	public int getH(){
		return h;
	}
}
class OOK implements Comparator<OK> {
    public int compare(OK h1, OK h2) {
        if(h1.getH() < h2.getH()) {
            return -1;
        } else if(h1.getH() > h2.getH()) {
            return 1;
        } else {
            return 0;
        }
    }
}
class Main{
	public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<OK> job = new ArrayList<>();
		int max = 0;
		int sum = 0;
		int a; int b;
		for(int x = 0; x < n; x++){
			a = sc.nextInt();
			b = sc.nextInt();
			job.add(new OK(a,b));
			if(max < b){
				max = b;
			}
			sum = sum + a;
		}
		Collections.sort(job,new OOK());
		boolean judge = true;
		int ai = 0;
		int bi;
		for(OK m : job){
			ai = ai + m.getC();
			bi = m.getH();
			if(ai > bi){
				judge = false;
			}
		}
		if(sum <= max && judge == true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
    }
}




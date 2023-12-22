import java.util.ArrayList;

class Main {
	public static void main(String[] args){
    int index=0;
    ArrayList<Integer> ar = new ArrayList<Integer>();
	while(true){
		ar.add(new java.util.Scanner(System.in).nextInt());
		if(ar.get(index)==0){
			break;
		}
		index++;
	}
	for(int i=0;i<index;i++){
		System.out.println("Case"+(i+1)+": "+ar.get(i));
	}
	}
}
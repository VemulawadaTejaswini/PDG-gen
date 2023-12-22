import java.util.*;

class Main{

public static int bunkai(int n){
    int r = 0;
    for(int i=2; i<=n; i++){
        if(n % i == 0){
            r = i;
            break;
        }
    }

    return r;
}    

public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    int n = Integer.parseInt(line);
    ArrayList<Integer> kotae = new ArrayList<>();

    int m = n;

    while(n != 1){
        kotae.add(bunkai(n));
        n = n / bunkai(n);
    }




    System.out.print(m + ": ");
    for(int i=0; i<kotae.size()-1; i++){
        System.out.print(kotae.get(i) + " ");

    }

    System.out.print(kotae.get(kotae.size()-1));
   
}

}
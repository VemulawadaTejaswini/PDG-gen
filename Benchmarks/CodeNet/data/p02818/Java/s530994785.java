public class NewClass {
    public static void num(int a,int b,int k){
        int count=0;
        while(count!=k){
            if(a>=1){
                a--;
                count++;
            }
            else if(b>=1){
                b--;
                count++;
            }
        }
        System.out.println("a ="+a+"b ="+b);
    }
    public static void main(String[] args) {
        int a=3;
        int b=4;
        int k=3;
        num(a,b,k);
    }
}
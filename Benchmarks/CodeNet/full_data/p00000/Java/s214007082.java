class Aizu0000 {
    public static void main(String[] a) {
        int x = 1;
        int y = 1;
        while(y <= 9){
            while(x<=9){
                int s = y * x;
                System.out.println(y +"x"+x+"="+s);
                x++;
            }
            y++;
            x = 1;
        }
    }
}
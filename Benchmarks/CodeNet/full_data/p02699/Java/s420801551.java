class SheepAndWolves {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(Sysytem.in);
        System.out.println("S＝");
        int S = scanner.next();
        System.out.println("W＝");
        int W = scanner.next();

        if (S <= W) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}
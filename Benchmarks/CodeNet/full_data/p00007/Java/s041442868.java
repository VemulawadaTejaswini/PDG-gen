class Main{
    public static final int DEPT = 100000;
    public static final BigDecimal INTEREST = new BigDecimal(0.05);
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int week = Integer.parseInt(s.next());
        BigDecimal repay = new BigDecimal(DEPT);
        for (int i = 0; i < week; ++i) {
            repay = repay.add(repay.multiply(INTEREST));
        }
        s.close();
        System.out.println(repay.setScale(0, BigDecimal.ROUND_HALF_UP));
    }
}
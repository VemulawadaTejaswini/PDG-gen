Scanner s = new Scanner(System.in);
        final long A = s.nextLong();
        final double B = s.nextDouble();

        BigDecimal bdResult = new BigDecimal(String.valueOf(A * B));

        System.out.println(bdResult.setScale(0, RoundingMode.DOWN));
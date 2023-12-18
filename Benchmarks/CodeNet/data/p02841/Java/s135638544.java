public class Main {
  
  public static void main(String[] args) {

        List<String> inputList = readInputList();

        byte maxDayFlag = 0;

        int[] arr = readYearAndMonth(inputList.get(0));

        Calendar cal = convertCalender(arr);
        if (cal.getActualMaximum(Calendar.DAY_OF_MONTH) == arr[ARR_INDEX_DAY])
            maxDayFlag = 1;

        System.out.println(maxDayFlag);
  }

    private List<String> readInputList() throws IOException {

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            List<String> inputList = new ArrayList<>();

            for (int i = 0; i < MAX_INPUT_LIMIT_COUNT; i++) {
                inputList.add(br.readLine());
            }

            return inputList;
    }

    private int[] readYearAndMonth(String inputStr) {
        int[] yearAndMonthArr = new int[2];
        String[] strArr = inputStr.split("\\s");

        yearAndMonthArr[ARR_INDEX_MONTH] = Integer.valueOf(strArr[ARR_INDEX_MONTH]);
        yearAndMonthArr[ARR_INDEX_DAY] = Integer.valueOf(strArr[ARR_INDEX_DAY]);

        return yearAndMonthArr;
    }

    private Calendar convertCalender(int[] yearAndMonthArr) {
        return new Calendar.Builder()
                .setLenient(true)
                .set(Calendar.YEAR, YEAR)
                .set(Calendar.MONTH, yearAndMonthArr[ARR_INDEX_MONTH] - 1)
                .set(Calendar.DAY_OF_MONTH, yearAndMonthArr[ARR_INDEX_DAY])
                .build();
    }

}
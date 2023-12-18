function Main(input) {
	input = new Date(input).getTime();
    var check = new Date("2019/04/30").getTime();
   console.log((input <= check) ? "Heisei" : "TBD");
}

Main(require("fs").readFileSync("/dev/stdin", "utf8"));
